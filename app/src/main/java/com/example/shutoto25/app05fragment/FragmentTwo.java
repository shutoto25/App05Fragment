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
 * 動的実装用Fragment.
 */
public class FragmentTwo extends Fragment {
    /**
     * フラグメントダイアログ起動.
     */
    private Button mButton;
    /**
     * フラグメント2コメント.
     */
    private TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        super.onCreateView(inflater, container, saveInstanceState);

        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);

        mTextView = view.findViewById(R.id.tvTextView);
        mButton = view.findViewById(R.id.btDialog);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ダイアログフラグメント生成.
                FragmentManager fragmentManager = getFragmentManager();
                MyDialogFragment dialog = MyDialogFragment.newInstance();
                dialog.setDialogTitle("Dialog2");
                dialog.setDialogMessage("Fragment2_dialog2");
                dialog.show(fragmentManager, "dialog");
            }
        });
    }
}
