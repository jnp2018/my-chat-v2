package com.vit.mychat.ui.friends.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vit.mychat.R;
import com.vit.mychat.data.model.Friend;
import com.vit.mychat.ui.base.BaseViewHolder;
import com.vit.mychat.util.GlideApp;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FriendOnlineAdapter extends RecyclerView.Adapter<FriendOnlineAdapter.FriendOnlineViewHolder> {
    private List<Friend> mListFriendOnline = new ArrayList<>();

    public FriendOnlineAdapter(List<Friend> mListFriendOnline) {
        this.mListFriendOnline = mListFriendOnline;
    }

    @NonNull
    @Override
    public FriendOnlineViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.friend_online_item, viewGroup, false);
        return new FriendOnlineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendOnlineViewHolder friendOnlineViewHolder, int i) {
        friendOnlineViewHolder.bindData(mListFriendOnline.get(i));
    }

    @Override
    public int getItemCount() {
        return mListFriendOnline.size();
    }

    class FriendOnlineViewHolder extends BaseViewHolder<Friend> {
        @BindView(R.id.image_avatar_online)
        ImageView mImageAvatar;

        @BindView(R.id.image_online)
        ImageView mImageOnline;

        @BindView(R.id.text_name)
        TextView mTextName;
        public FriendOnlineViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void bindData(Friend friend) {
            GlideApp.with(itemView.getContext())
                    .load(friend.getAvatar())
                    .circleCrop()
                    .into(mImageAvatar);

            mImageOnline.setVisibility(View.GONE);
            if(friend.isOnline()){
                mImageOnline.setVisibility(View.VISIBLE);
            }
            mTextName.setText(friend.getName());
        }
    }
}
