package com.sisensing.common.adapter;

import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sisensing.common.R;
import com.sisensing.common.entity.personalcenter.DictTypeEntity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author y.xie
 * @date 2021/5/25 9:33
 * @desc 糖尿病类型适配器
 */
public class BfzAdapter extends BaseQuickAdapter<DictTypeEntity, BaseViewHolder> {

    public BfzAdapter(int layoutResId, @Nullable List<DictTypeEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, DictTypeEntity tnbTypeEntity) {
        TextView mTvTnbType = baseViewHolder.getView(R.id.tv_tnb_type);
        mTvTnbType.setText(tnbTypeEntity.getDictLabel());

        if (tnbTypeEntity.isSelect()){
            mTvTnbType.setBackgroundResource(R.drawable.bg_radius22_00d5b8_solid);
            mTvTnbType.setTextColor(ContextCompat.getColor(getContext(),R.color.white));
        }else {
            mTvTnbType.setBackgroundResource(R.drawable.bg_radius22_f3f3f3_solid);
            mTvTnbType.setTextColor(ContextCompat.getColor(getContext(),R.color.color_cccccc));
        }
    }
}
