package Chain;

import Processors.NegetiveProcessor;
import Processors.PositiveProcessor;
import Processors.Processor;
import Processors.ZeroProcessor;

public class Chain {

    Processor chain;
    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegetiveProcessor(new PositiveProcessor(new ZeroProcessor(null)));
    }

    public void process(Number number) {
            chain.process(number);
    }

}
