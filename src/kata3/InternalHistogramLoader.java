package kata3;

import kata3.core.Histogram;
import kata3.core.HistogramLoader;

public class InternalHistogramLoader {
    private static final String[] data = new String[] {
     "Cadiz", "Madrid", "Madrid", "Barcelona", "Barcelona", "Sevilla", "Madrid", "Madrid", "Zaragoza", "Madrid" 
    };
    
    //@Override
    public Histogram load(){
        Histogram histogram = new Histogram();
        for (String region : data){
            histogram.add(region);
        }
        return histogram;
    }
            
}
