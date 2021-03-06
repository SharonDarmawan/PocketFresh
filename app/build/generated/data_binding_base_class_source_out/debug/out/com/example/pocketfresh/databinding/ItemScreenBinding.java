// Generated by view binder compiler. Do not edit!
package com.example.pocketfresh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.pocketfresh.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton back;

  @NonNull
  public final ImageView bananaImage;

  @NonNull
  public final TabItem description;

  @NonNull
  public final TabItem howToSelect;

  @NonNull
  public final ImageButton like;

  @NonNull
  public final LinearLayout linearlayout;

  @NonNull
  public final TextView nutrients;

  @NonNull
  public final TabItem recipes;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final MaterialCardView tabs;

  @NonNull
  public final ViewPager viewpager;

  private ItemScreenBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton back,
      @NonNull ImageView bananaImage, @NonNull TabItem description, @NonNull TabItem howToSelect,
      @NonNull ImageButton like, @NonNull LinearLayout linearlayout, @NonNull TextView nutrients,
      @NonNull TabItem recipes, @NonNull TabLayout tabLayout, @NonNull MaterialCardView tabs,
      @NonNull ViewPager viewpager) {
    this.rootView = rootView;
    this.back = back;
    this.bananaImage = bananaImage;
    this.description = description;
    this.howToSelect = howToSelect;
    this.like = like;
    this.linearlayout = linearlayout;
    this.nutrients = nutrients;
    this.recipes = recipes;
    this.tabLayout = tabLayout;
    this.tabs = tabs;
    this.viewpager = viewpager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageButton back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.banana_image;
      ImageView bananaImage = ViewBindings.findChildViewById(rootView, id);
      if (bananaImage == null) {
        break missingId;
      }

      id = R.id.description;
      TabItem description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.how_to_select;
      TabItem howToSelect = ViewBindings.findChildViewById(rootView, id);
      if (howToSelect == null) {
        break missingId;
      }

      id = R.id.like;
      ImageButton like = ViewBindings.findChildViewById(rootView, id);
      if (like == null) {
        break missingId;
      }

      id = R.id.linearlayout;
      LinearLayout linearlayout = ViewBindings.findChildViewById(rootView, id);
      if (linearlayout == null) {
        break missingId;
      }

      id = R.id.nutrients;
      TextView nutrients = ViewBindings.findChildViewById(rootView, id);
      if (nutrients == null) {
        break missingId;
      }

      id = R.id.recipes;
      TabItem recipes = ViewBindings.findChildViewById(rootView, id);
      if (recipes == null) {
        break missingId;
      }

      id = R.id.tab_layout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.tabs;
      MaterialCardView tabs = ViewBindings.findChildViewById(rootView, id);
      if (tabs == null) {
        break missingId;
      }

      id = R.id.viewpager;
      ViewPager viewpager = ViewBindings.findChildViewById(rootView, id);
      if (viewpager == null) {
        break missingId;
      }

      return new ItemScreenBinding((ConstraintLayout) rootView, back, bananaImage, description,
          howToSelect, like, linearlayout, nutrients, recipes, tabLayout, tabs, viewpager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
