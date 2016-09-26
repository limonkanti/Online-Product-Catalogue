

package display;
import dao.ListDao;
import entity.Product;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class DisplayProductMB {
    Product product=new Product();
    private Product selectedProduct;

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
    
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public List<Product> getAllProduct()
    {
        List<Product> plist=new ListDao().allProductList();
        return plist;
    }
    
    
}
