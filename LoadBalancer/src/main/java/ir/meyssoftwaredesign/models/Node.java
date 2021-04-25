package ir.meyssoftwaredesign.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(ipAddress, node.ipAddress) &&
                status == node.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, status);
    }
}
