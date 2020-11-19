package co.domi.guiaclase15;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StoreAdapter extends BaseAdapter {

    private ArrayList<Product> products;

    public StoreAdapter(){
        products = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product, null);
        TextView nameTV = row.findViewById(R.id.nameTV);
        TextView priceTV = row.findViewById(R.id.priceTV);
        Button starBtn = row.findViewById(R.id.startBtn);
        ImageView image = row.findViewById(R.id.image);

        nameTV.setText(products.get(i).getName());
        priceTV.setText(""+products.get(i).getPrice());
        if(products.get(i).isLiked())
            starBtn.setBackgroundResource(R.drawable.star);
        else
            starBtn.setBackgroundResource(R.drawable.starborder);

        return row;
    }

    public void addProduct(Product product){
        products.add(product);
        notifyDataSetChanged();
    }
}
