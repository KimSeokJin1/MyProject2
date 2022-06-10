package space.space.first.noted;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import space.space.first.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private Context context;
    private List<String>mainArray;


    public MainAdapter(Context context) {
        this.context = context;
        mainArray=  new ArrayList<>();
    }


    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //рисует элемент
        // класс позволяет нарисовать разметку на экране.нарисуй
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_layuot,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder holder, int position) {
        holder.setData(mainArray.get(position));

    }

    @Override
    public int getItemCount() {
        return mainArray.size();//сколько элементов в массиве+
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tvtitle);
        }
        public void setData(String title){
            tvTitle.setText(title);
        }
    }
    public void updateAdappter(List<String>newList){
        mainArray.clear();//очистить массив
        mainArray.addAll(newList);//Заполнение массива ;произошли изменения
        notifyDataSetChanged();//сообщает об обновление
    }
}
