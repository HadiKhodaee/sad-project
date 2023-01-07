package ir.znu.sad.business.service.handlers;

import ir.znu.sad.business.product.TopProductProvider;
import ir.znu.sad.datatype.data.Product;
import ir.znu.sad.utils.JsonTools;
import ir.znu.sad.utils.datatype.BaseResult;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("api/product/top")
public class HandlerTopProduct {

    @GET
    @Path("/view")
    @Produces("application/json;charset=utf-8")
//    @Consumes("application/json;charset=utf-8")
    public String getTopViewedProduct(String authenticationJson) {
        List<Product> result =new ArrayList<>();
        result.add(new Product("N1","B1",1));
        return JsonTools.toJson(result);
//        try {
//            return JsonTools.toJson(
//                    new BaseResult<>(TopProductProvider.getTopViewedProduct()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

}
