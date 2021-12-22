// Generated by view binder compiler. Do not edit!
package com.example.android.effectivenavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.effectivenavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSectionLaunchpadBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button expenseButton;

  @NonNull
  public final TextView expenseFtText;

  @NonNull
  public final TextView expenseSetResult;

  @NonNull
  public final Button incomeButton;

  @NonNull
  public final TextView incomeFtText;

  @NonNull
  public final TextView incomeSetResult;

  @NonNull
  public final Button mainPlusButton;

  @NonNull
  public final RecyclerView recyclerIdTransaction;

  private FragmentSectionLaunchpadBinding(@NonNull LinearLayout rootView,
      @NonNull Button expenseButton, @NonNull TextView expenseFtText,
      @NonNull TextView expenseSetResult, @NonNull Button incomeButton,
      @NonNull TextView incomeFtText, @NonNull TextView incomeSetResult,
      @NonNull Button mainPlusButton, @NonNull RecyclerView recyclerIdTransaction) {
    this.rootView = rootView;
    this.expenseButton = expenseButton;
    this.expenseFtText = expenseFtText;
    this.expenseSetResult = expenseSetResult;
    this.incomeButton = incomeButton;
    this.incomeFtText = incomeFtText;
    this.incomeSetResult = incomeSetResult;
    this.mainPlusButton = mainPlusButton;
    this.recyclerIdTransaction = recyclerIdTransaction;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSectionLaunchpadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSectionLaunchpadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_section_launchpad, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSectionLaunchpadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expense_button;
      Button expenseButton = ViewBindings.findChildViewById(rootView, id);
      if (expenseButton == null) {
        break missingId;
      }

      id = R.id.expense_ft_text;
      TextView expenseFtText = ViewBindings.findChildViewById(rootView, id);
      if (expenseFtText == null) {
        break missingId;
      }

      id = R.id.expense_set_result;
      TextView expenseSetResult = ViewBindings.findChildViewById(rootView, id);
      if (expenseSetResult == null) {
        break missingId;
      }

      id = R.id.income_button;
      Button incomeButton = ViewBindings.findChildViewById(rootView, id);
      if (incomeButton == null) {
        break missingId;
      }

      id = R.id.income_ft_text;
      TextView incomeFtText = ViewBindings.findChildViewById(rootView, id);
      if (incomeFtText == null) {
        break missingId;
      }

      id = R.id.income_set_result;
      TextView incomeSetResult = ViewBindings.findChildViewById(rootView, id);
      if (incomeSetResult == null) {
        break missingId;
      }

      id = R.id.main_plus_button;
      Button mainPlusButton = ViewBindings.findChildViewById(rootView, id);
      if (mainPlusButton == null) {
        break missingId;
      }

      id = R.id.recycler_id_transaction;
      RecyclerView recyclerIdTransaction = ViewBindings.findChildViewById(rootView, id);
      if (recyclerIdTransaction == null) {
        break missingId;
      }

      return new FragmentSectionLaunchpadBinding((LinearLayout) rootView, expenseButton,
          expenseFtText, expenseSetResult, incomeButton, incomeFtText, incomeSetResult,
          mainPlusButton, recyclerIdTransaction);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
