package Processors;

import Chain.Number;

public class ZeroProcessor extends Processor{
    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
        if(request.getNumber() == 0) {
            System.out.println("Zero Processor");
        } else {
            super.process(request);
        }
    }
}
