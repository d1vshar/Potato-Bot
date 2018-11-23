
package DevPaw.api.classes.TradePrice;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lowestbuy implements Serializable {
	private static final long serialVersionUID = 4824463550348651394L;

    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("nationid")
    @Expose
    public String nationid;
    @SerializedName("amount")
    @Expose
    public String amount;
    @SerializedName("price")
    @Expose
    public String price;
    @SerializedName("totalvalue")
    @Expose
    public int totalvalue;

}
