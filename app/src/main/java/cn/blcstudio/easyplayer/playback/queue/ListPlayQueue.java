package cn.blcstudio.easyplayer.playback.queue;

import java.util.List;

import cn.blcstudio.easyplayer.model.Music;

/**
 * Created by ginger on 2016/6/15.
 */

public class ListPlayQueue extends BaseQueue {

    @Override
    public boolean moveToNext(List<Music> queue) {
        cur ++;
        if (cur >= queue.size()) {
            cur --;
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean moveToPrev(List<Music> queue) {
        cur --;
        if (cur < 0) {
            cur ++;
            return false;
        }
        else {
            return true;
        }
    }
}
