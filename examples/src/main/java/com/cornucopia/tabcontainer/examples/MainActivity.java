package com.cornucopia.tabcontainer.examples;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.cornucopia.tabcontainer.TabLayout;
import com.cornucopia.tabcontainer.examples.adapter.MyFragmentPagerAdapter;
import com.cornucopia.tabcontainer.examples.ui.DemoFragment;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private Button change;
  private TabLayout tl;
  private ViewPager viewPager;

  private int mode = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    change = findViewById(R.id.change);
    tl = findViewById(R.id.tl);
    viewPager = findViewById(R.id.vp);

    List<String> titles = new ArrayList<>();
    titles.add("XXXXXXXXXXXXXXXXX");
    titles.add("XXXXXXXXXXXXXXXXX");
    titles.add("XXXXXXXXXXXXXXXXX");

    List<DemoFragment> fragments = new ArrayList<>();
    fragments.add(DemoFragment.newInstance("123"));
    fragments.add(DemoFragment.newInstance("456"));
    fragments.add(DemoFragment.newInstance("789"));

    MyFragmentPagerAdapter myFragmentPagerAdapter =
        new MyFragmentPagerAdapter(getSupportFragmentManager()
            , FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
            titles, fragments);
    viewPager.setAdapter(myFragmentPagerAdapter);
    tl.setupWithViewPager(viewPager);
    tl.setTabIndicatorFullWidth(false);
    change.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        //if(mode==0){
        //  tl.setTabMode(TabLayout.MODE_SCROLLABLE);
        //  mode=1;
        //}else{
        //  tl.setTabMode(TabLayout.MODE_FIXED);
        //  mode=0;
        //}

      }
    });
  }
}
