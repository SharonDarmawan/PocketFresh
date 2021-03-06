// Generated by view binder compiler. Do not edit!
package com.example.pocketfresh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pocketfresh.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDescriptionBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button item1;

  @NonNull
  public final Button item2;

  @NonNull
  public final TextView nutrients;

  @NonNull
  public final TextView nutrientsDesc;

  @NonNull
  public final TextView recommendedItems;

  @NonNull
  public final LinearLayout recommendedItemsList;

  @NonNull
  public final TextView season;

  @NonNull
  public final TextView seasonDesc;

  @NonNull
  public final TextView store;

  @NonNull
  public final TextView storeDesc;

  private FragmentDescriptionBinding(@NonNull ScrollView rootView, @NonNull Button item1,
      @NonNull Button item2, @NonNull TextView nutrients, @NonNull TextView nutrientsDesc,
      @NonNull TextView recommendedItems, @NonNull LinearLayout recommendedItemsList,
      @NonNull TextView season, @NonNull TextView seasonDesc, @NonNull TextView store,
      @NonNull TextView storeDesc) {
    this.rootView = rootView;
    this.item1 = item1;
    this.item2 = item2;
    this.nutrients = nutrients;
    this.nutrientsDesc = nutrientsDesc;
    this.recommendedItems = recommendedItems;
    this.recommendedItemsList = recommendedItemsList;
    this.season = season;
    this.seasonDesc = seasonDesc;
    this.store = store;
    this.storeDesc = storeDesc;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_description, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDescriptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item1;
      Button item1 = ViewBindings.findChildViewById(rootView, id);
      if (item1 == null) {
        break missingId;
      }

      id = R.id.item2;
      Button item2 = ViewBindings.findChildViewById(rootView, id);
      if (item2 == null) {
        break missingId;
      }

      id = R.id.nutrients;
      TextView nutrients = ViewBindings.findChildViewById(rootView, id);
      if (nutrients == null) {
        break missingId;
      }

      id = R.id.nutrients_desc;
      TextView nutrientsDesc = ViewBindings.findChildViewById(rootView, id);
      if (nutrientsDesc == null) {
        break missingId;
      }

      id = R.id.recommended_items;
      TextView recommendedItems = ViewBindings.findChildViewById(rootView, id);
      if (recommendedItems == null) {
        break missingId;
      }

      id = R.id.recommended_items_list;
      LinearLayout recommendedItemsList = ViewBindings.findChildViewById(rootView, id);
      if (recommendedItemsList == null) {
        break missingId;
      }

      id = R.id.season;
      TextView season = ViewBindings.findChildViewById(rootView, id);
      if (season == null) {
        break missingId;
      }

      id = R.id.season_desc;
      TextView seasonDesc = ViewBindings.findChildViewById(rootView, id);
      if (seasonDesc == null) {
        break missingId;
      }

      id = R.id.store;
      TextView store = ViewBindings.findChildViewById(rootView, id);
      if (store == null) {
        break missingId;
      }

      id = R.id.store_desc;
      TextView storeDesc = ViewBindings.findChildViewById(rootView, id);
      if (storeDesc == null) {
        break missingId;
      }

      return new FragmentDescriptionBinding((ScrollView) rootView, item1, item2, nutrients,
          nutrientsDesc, recommendedItems, recommendedItemsList, season, seasonDesc, store,
          storeDesc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
