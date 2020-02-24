package com.example.shutoto25.app05fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * 静的実装用Fragment.
 */
public class FragmentOne extends Fragment {
    /**
     * フラグメントダイアログ起動.
     */
    private Button mButton;
    /**
     * フラグメント1コメント.
     */
    private TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        super.onCreateView(inflater, container, saveInstanceState);

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        mTextView = view.findViewById(R.id.tvTextView);
        mButton = view.findViewById(R.id.btDialog);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // フラグメントダイアログ生成.
                FragmentManager fragmentManager = getFragmentManager();
                MyDialogFragment dialog = MyDialogFragment.newInstance();
                dialog.setDialogTitle("Dialog1");
                dialog.setDialogMessage("Fragment1_dialog1");
                dialog.show(fragmentManager, "dialog");
            }
        });
        return view;
    }
}