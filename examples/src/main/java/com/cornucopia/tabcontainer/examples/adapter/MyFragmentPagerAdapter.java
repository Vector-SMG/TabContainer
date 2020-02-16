package com.cornucopia.tabcontainer.examples.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.cornucopia.tabcontainer.examples.ui.DemoFragment;
import java.util.List;

/**
 * @author Cornucopia
 * @version 1.0
 * @since 2020-02-16
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

  private List<String> titles;
  private List<DemoFragment> fragments;

  public MyFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior,
      List<String> titles,
      List<DemoFragment> fragments) {
    super(fm, behavior);
    this.titles = titles;
    this.fragments = fragments;
  }

  @NonNull @Override public Fragment getItem(int position) {
    return fragments.get(position);
  }

  @Override public int getCount() {
    return titles == null ? 0 : titles.size();
  }

  @Nullable @Override public CharSequence getPageTitle(int position) {
    return titles == null ? null : titles.get(position);
  }
}
