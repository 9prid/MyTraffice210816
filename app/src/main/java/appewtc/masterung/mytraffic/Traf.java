package appewtc.masterung.mytraffic;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lenovo on 8/21/2016.
 */
public class Traf extends BaseAdapter{

    //explicit
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings, stockStrings, priceStrings;

    public Traf(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings, String[] stockStrings, String[] priceStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.stockStrings = stockStrings;
        this.priceStrings = priceStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);
        //Bind Widget
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        TextView stockTextView = (TextView) view1.findViewById(R.id.textView4);
        TextView priceTextView = (TextView) view1.findViewById(R.id.textView5);

        //Show View
        iconImageView.setImageResource(iconInts[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        stockTextView.setText(stockStrings[i]);
        priceTextView.setText(priceStrings[i]);

        return view1;
    }
}  //Main Class
