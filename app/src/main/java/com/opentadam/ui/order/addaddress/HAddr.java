/*
 * Copyright (C) 2019 TadamGroup, LLC.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.opentadam.ui.order.addaddress;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractDraggableItemViewHolder;
import com.opentadam.R;
import com.opentadam.utils.TintIcons;


public class HAddr extends AbstractDraggableItemViewHolder {
    private int position;
    private TextView editText;
    private ImageView icon;


    public HAddr(View itemView, final IHAddr ihAddr) {
        super(itemView);

        editText = itemView.findViewById(R.id.i_aa_text);

        icon = itemView.findViewById(R.id.i_aa_icon);
        TintIcons.tintImageViewBrend(icon);
        View iconDelete = itemView.findViewById(R.id.i_aa_icon_delete);
        iconDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ihAddr.removeItem(position);
            }
        });

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ihAddr.editItem(position);
            }
        });
    }

    public void update(final Data item
            , final int position) {

        this.position = position;
        editText.setText(item.alias);

        TintIcons.tintImageViewOther(icon, R.color.colorPrimary);
        icon.setVisibility(View.VISIBLE);
    }

}