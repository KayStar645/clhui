import java.io.IOException;

public class run {
    public static void main(String[] args) throws IOException {
        AlgoCLHMiner clhui = new AlgoCLHMiner();

        // int minUtil = 80000;
        // String inputPath = "./data/LiquorTransaction.txt";
        // String outputPath = "./data/LiquorOutput.txt";
        // String TaxonomyPath = "./data/LiquorTaxonomy.txt";

        int minUtil = 60;
        String inputPath = "./test/input.txt";
        String outputPath = "./test/output.txt";
        String TaxonomyPath = "./test/taxonomy.txt";

        clhui.runAlgorithm(minUtil, inputPath, outputPath, TaxonomyPath);
        clhui.printStats();
    }
}
