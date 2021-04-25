package ir.meyssoftwaredesign.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoadBalancer {
    private Map<String,Node> map = new HashMap<>();

    public Map<String, Node> getMap() {
        return map;
    }

    public MyNodeStatus registerNode(Node node){
        if(map.get(node.getIpAddress()) == null && map.size() < 10){
            map.put(node.getIpAddress(), node);
            System.out.println(String.format("node by ip %s registered successfully", node.getIpAddress() ));
            node.setStatus(MyNodeStatus.Registered);
        }
        return node.getStatus();

    }



}
