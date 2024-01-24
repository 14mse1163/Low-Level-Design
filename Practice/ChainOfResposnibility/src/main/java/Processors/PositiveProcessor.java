package Processors;

import Chain.Number;

public class PositiveProcessor extends  Processor
{
    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
        if(request.getNumber() > 0) {
            System.out.println("Positive Processor");
        } else {
            super.process(request);
        }
    }
}
