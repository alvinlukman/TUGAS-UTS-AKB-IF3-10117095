package unikom.tugasutsakb.fauzisunarya_10117110.presenter;

import android.view.View;
/** NIM : 10117095
 * Nama : Alvin Lukman Nulhakim
 * Kelas : IF-3
 * Tanggal : 12-Mei-2020**/
public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnItemClickListener(int position, CustomOnItemClickListener.OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }

    public interface  OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
