package edu.anadolu.similarities;

import org.apache.lucene.search.similarities.ModelBase;

/** 
 * This class implements a parameterized BM25  weighting model.
 **/

public class BM25F extends ModelBase {

    private final float k1;
    private final float b;

    /**
     * BM25 with the supplied parameter values.
     * @param k1 Controls non-linear term frequency normalization (saturation).
     * @param b Controls to what degree document length normalizes tf values.
     * @throws IllegalArgumentException if {@code k1} is infinite or negative, or if {@code b} is
     *         not within the range {@code [0..1]}
     */
    
    @Override
    public String toString(){
        return "BM25 (k1= "+ k1 + ", b= "+ b +")";
    }

}