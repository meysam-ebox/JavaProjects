package ir.meyssoftwaredesign.models;

public class Node {
    private String ipAddress;
    private MyNodeStatus status;

    public Node() {
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setStatus(MyNodeStatus registered) {
        this.status = registered;
    }

    public MyNodeStatus getStatus() {
        return status;
    }


}
