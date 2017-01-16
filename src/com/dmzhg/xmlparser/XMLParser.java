package com.dmzhg.xmlparser;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dmzhg
 */
public class XMLParser {

    public XMLParser() {
    }

    public void parseXML() {
        String filepath = "doc.xml";
        File xmlFile = new File(filepath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            // Получаем корневой элемент
            Node root = document.getDocumentElement();
            System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());
            InterfaceXMLDocument xmlDocument = getXMLDocumentInfo(root);
            NodeList orderHeaders = document.getElementsByTagName("OrderHeader");
            List<OrderHeader> ordersList = new ArrayList<>();
            for (int i = 0; i < orderHeaders.getLength(); i++) {
                Node node = orderHeaders.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Parsing node: " + element.getNodeName());
                    OrderHeader header = extractOrderHeaderInfo(node);
                    ordersList.add(header);
                }
            }
            System.out.println("GOOD!");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    // получаем значение элемента по указанному тегу
    private String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }

    // создаем из узла документа объект OrderHeader
    private OrderHeader extractOrderHeaderInfo(Node node) {
        OrderHeader header = new OrderHeader();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            header.setId(getTagValue("ID", element));
            NodeList orderDetails = element.getElementsByTagName("OrderDetail");
            for (int i = 0; i < orderDetails.getLength(); i++) {
                Node detailNode = orderDetails.item(i);
                OrderDetail detail = extractOrderDetailInfo(detailNode);
                header.getOrderDetails().add(detail);
            }
        }
        return header;
    }

    private OrderDetail extractOrderDetailInfo(Node detailNode) {
        OrderDetail detail = new OrderDetail();
        if (detailNode.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) detailNode;
            detail.setCode(getTagValue("Code", element));
        }
        return detail;
    }

    private InterfaceXMLDocument getXMLDocumentInfo(Node node) {
        InterfaceXMLDocument xmlDocument = new InterfaceXMLDocument();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            System.out.println("Parsing node: " + element.getNodeName());
            xmlDocument.setDescription(getTagValue("Description", element));
            xmlDocument.setVersion(new BigDecimal(getTagValue("Version", element)));
            xmlDocument.setCreationDate(LocalDateTime.parse(getTagValue("CreationDate", element)));
        }
        return xmlDocument;
    }
}