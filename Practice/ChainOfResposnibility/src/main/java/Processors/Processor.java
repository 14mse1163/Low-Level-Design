package Processors;

import Chain.Number;

public abstract class Processor {
    Processor nextProcessor;
    public Processor(Processor processor) {
        this.nextProcessor = processor;
    }

    public void process(Number request) {
            if(nextProcessor != null){
                nextProcessor.process(request);
            }
    }
}
