import java.util.Arrays;
import java.util.Comparator;

public class Product {
    String productId;
    String productName;
    String category;
    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public static int linearSearch(Product[] products, String targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId.equals(targetId)) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Product[] products, String targetId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productId.compareTo(targetId);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    int size = 145; 
    Product[] productList = new Product[size];

    for (int i = 0; i < size; i++) {
        String pid = String.format("P%03d", i + 1); 
        productList[i] = new Product(pid, "Product" + (i + 1), "Category" + (i % 5));
    }

    String targetId = "P100";

    // ========== LINEAR SEARCH ==========
    long linearStart = System.nanoTime();
    int linearIndex = linearSearch(productList, targetId);
    long linearEnd = System.nanoTime();
    System.out.println("Linear Search: Index = " + linearIndex + ", Time = " + (linearEnd - linearStart) + " ns");

    // ========== BINARY SEARCH ==========
    Arrays.sort(productList, Comparator.comparing(p -> p.productId));
    long binaryStart = System.nanoTime();
    int binaryIndex = binarySearch(productList, targetId);
    long binaryEnd = System.nanoTime();
    System.out.println("Binary Search: Index = " + binaryIndex + ", Time = " + (binaryEnd - binaryStart) + " ns");
}

}
