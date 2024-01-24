package Processors;

import Chain.Number;

public class NegetiveProcessor extends Processor{
    public NegetiveProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
            if(request.getNumber() < 0) {
                System.out.println("Negetive Processor");
            } else {
                super.process(request);
            }
    }
}
