package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.DecoratorPartternClient;
import hello.proxy.pureproxy.decorator.code.MessageDecorator;
import hello.proxy.pureproxy.decorator.code.RealComponent;
import hello.proxy.pureproxy.decorator.code.TimeDecorator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        RealComponent realComponent = new RealComponent();
        DecoratorPartternClient client = new DecoratorPartternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator1(){
        RealComponent realComponent = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(realComponent);
        DecoratorPartternClient client = new DecoratorPartternClient(messageDecorator);
        client.execute();
    }

    @Test
    void decorator2(){
        RealComponent realComponent = new RealComponent();
        TimeDecorator timeDecorator = new TimeDecorator(realComponent);
        MessageDecorator messageDecorator = new MessageDecorator(timeDecorator);
        DecoratorPartternClient client = new DecoratorPartternClient(messageDecorator);
        client.execute();
    }
}
