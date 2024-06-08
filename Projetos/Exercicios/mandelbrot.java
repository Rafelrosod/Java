public class mandelbrot {
    public static void main(String[] args) {
        int height = 60; // Altura do conjunto
        int width = 80; // Largura do conjunto
        double reMin = -2.0;
        double reMax = 2.0;
        double imMin = -2.0;
        double imMax = 2.0;
        int maxIterations = 1000; // Número máximo de iterações

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double cre = map(x, 0, width, reMin, reMax);
                double cim = map(y, 0, height, imMin, imMax);
                double x0 = cre;
                double y0 = cim;
                int iteration = 0;
                while (iteration < maxIterations) {
                    double xTemp = x0 * x0 - y0 * y0 + cre;
                    double yTemp = 2 * x0 * y0 + cim;
                    if (xTemp * xTemp + yTemp * yTemp > 4) {
                        break;
                    }
                    x0 = xTemp;
                    y0 = yTemp;
                    iteration++;
                }
                if (iteration == maxIterations) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static double map(int value, int min1, int max1, double min2, double max2) {
        return min2 + (max2 - min2) * ((double) value - min1) / (max1 - min1);
    }
}
