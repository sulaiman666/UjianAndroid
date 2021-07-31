package id.solo.ujianandroidapp.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import id.solo.ujianandroidapp.R;
import id.solo.ujianandroidapp.entity.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<Product> dataProduct;
    private Context context;

    public ProductAdapter(Context context, ArrayList<Product> dataProduct) {
        this.dataProduct = dataProduct;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_product, parent, false);
        return new ProductAdapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Glide.with(context)
            .load(dataProduct.get(position).getLinkProduk())
            .into(holder.itemImg);
        holder.itemTvName.setText(dataProduct.get(position).getNamaProduk());
        holder.itemTvPrice.setText(dataProduct.get(position).getHargaProduk());
        holder.itemTvDescription.setText(dataProduct.get(position).getDeskripsiProduk());
        holder.itemTvCategory.setText(dataProduct.get(position).getKategoriProduk());
    }

    @Override
    public int getItemCount() {
        return (dataProduct != null) ? dataProduct.size() : 0;
    }

    public class ProductViewHolder  extends RecyclerView.ViewHolder{
        public ImageView itemImg;
        public TextView itemTvName, itemTvPrice, itemTvDescription, itemTvCategory;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImg = itemView.findViewById(R.id.item_image);
            itemTvName = itemView.findViewById(R.id.item_tv_name);
            itemTvPrice = itemView.findViewById(R.id.item_tv_price);
            itemTvDescription = itemView.findViewById(R.id.item_tv_description);
            itemTvCategory = itemView.findViewById(R.id.item_tv_category);
        }
    }
}
