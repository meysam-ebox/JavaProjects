import ir.meyssoftwaredesign.models.LoadBalancer;
import ir.meyssoftwaredesign.models.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoadBalancerTester {


    @Test
    public void testRegiteration(){
        LoadBalancer loadBalancer = new LoadBalancer();
        Node node = new Node();
        node.setIpAddress("13524154");

        Node node1 = new Node();
        node1.setIpAddress("13524154");

        Node node2 = new Node();
        node2.setIpAddress("3453453454");

        loadBalancer.registerNode(node);
        loadBalancer.registerNode(node1);
        loadBalancer.registerNode(node2);
        System.out.println(String.format("count - %d",loadBalancer.getMap().size()) );
        Assertions.assertTrue(loadBalancer.getMap().size() == 2, "Wasn't equal");
    }
}
