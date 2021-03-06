/*
 * Copyright 2015 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.smoothappbarlayoutdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import me.henrytao.smoothappbarlayoutdemo.R;

public class SmoothNestedScrollViewParallax2Fragment extends BaseFeatureFragment {

  public static Fragment newInstance() {
    return new SmoothNestedScrollViewParallax2Fragment();
  }

  @Override
  public int getContentLayout() {
    return R.layout.fragment_smooth_nested_scroll_view_parallax_2;
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }
}
