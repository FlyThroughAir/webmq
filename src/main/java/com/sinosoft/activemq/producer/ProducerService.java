package com.sinosoft.activemq.producer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    //    @Resource(name="jmsTemplate")
    @Autowired
    private JmsTemplate jmsTemplate;


    public void sendMessage(Destination destination, final String msg){
        System.out.println("Send " + msg + " to Destination " + destination.toString());

        MessageCreator messageCreator = new MessageCreator(){
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        };

        jmsTemplate.send(destination, messageCreator);
    }


    public void sendMessage(final String msg){

        String destination = jmsTemplate.getDefaultDestinationName().toString();
        System.out.println("Send " + msg + " to Destination " + destination);
        MessageCreator messageCreator = new MessageCreator(){

            public Message createMessage(Session session) throws JMSException {
                // TODO Auto-generated method stub
                return session.createTextMessage(msg);
            }

        };

        jmsTemplate.send(messageCreator);
    }
}