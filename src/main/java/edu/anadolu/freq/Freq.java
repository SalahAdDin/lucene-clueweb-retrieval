package edu.anadolu.freq;


/**
 * How term frequency types : Phi frequency distribution and relative frequency distribution
 */
public enum Freq {

    Phi, Rel, Sqrt, Log, Ratio, Zero, Diri;

    public String fileName(int numBins) {

        if (Diri.equals(this)) return "contents_dirichlet_freq_" + numBins + ".csv";
        if (Zero.equals(this)) return "contents_zero_freq_" + numBins + ".csv";
        if (Phi.equals(this)) return "contents_phi_freq_" + numBins + ".csv";
        if (Rel.equals(this)) return "contents_all_freq_" + numBins + ".csv";
        if (Sqrt.equals(this) || Log.equals(this) || Ratio.equals(this)) return "contents_all_freq_" + numBins + ".csv";

        throw new AssertionError(this);
    }
}
