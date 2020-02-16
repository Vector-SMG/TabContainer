package com.cornucopia.tabcontainer.examples.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.cornucopia.tabcontainer.examples.R;

/**
 * @author Cornucopia
 * @version 1.0
 * @since 2020-02-16
 */
public class DemoFragment extends Fragment {

  public static final String TAG = "DemoFragment";
  private String content;

  public static DemoFragment newInstance(String content) {
    DemoFragment demoFragment = new DemoFragment();
    Bundle args = new Bundle();
    args.putString(TAG, content);
    demoFragment.setArguments(args);
    return demoFragment;
  }

  @Override public void onAttach(@NonNull Context context) {
    super.onAttach(context);
    content = getArguments().getString(TAG);
  }

  @Nullable @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.demo_fg_layout, container,false);
    TextView tv=root.findViewById(R.id.demo_fg_tv);
    Log.e(TAG,content+"");
    tv.setText(content);
    return root;
  }
}
