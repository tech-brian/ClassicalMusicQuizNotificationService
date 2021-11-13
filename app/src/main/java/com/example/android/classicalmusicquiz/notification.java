//package com.example.android.classicalmusicquiz;
//
//import android.app.NotificationChannel;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Build;
//import android.support.v4.media.session.PlaybackStateCompat;
//
//
//import androidx.core.app.NotificationCompat;
//import androidx.media.session.MediaButtonReceiver;
//
//public class notification {
//
//
//    public static NotificationManager notificationManager;
//    private static final String CHANNEL_ID = "CHANNEL_ID";
//    public static QuizActivity s;
//
//        public static void showNotification(PlaybackStateCompat state, Context context) {
//
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID);
//            notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            NotificationChannel mChannel = new NotificationChannel(
//                    CHANNEL_ID,
//                    "primary",
//                    NotificationManager.IMPORTANCE_HIGH);
//            notificationManager.createNotificationChannel(mChannel);
//        }
//
//        int icon;
//        String play_pause;
//        if (state.getState() == PlaybackStateCompat.STATE_PLAYING) {
//            icon = R.drawable.exo_controls_pause;
//            play_pause = context.getString(R.string.pause);
//        } else {
//            icon = R.drawable.exo_controls_play;
//            play_pause = context.getString(R.string.play);
//        }
//
//        NotificationCompat.Action playPauseAction = new NotificationCompat.Action(
//                icon, play_pause,
//                MediaButtonReceiver.buildMediaButtonPendingIntent(context, PlaybackStateCompat.ACTION_PLAY_PAUSE));
//
//        NotificationCompat.Action restartAction = new NotificationCompat.Action(R.drawable.exo_controls_previous, context.getString(R.string.restart),
//                MediaButtonReceiver.buildMediaButtonPendingIntent(context, PlaybackStateCompat.ACTION_SKIP_TO_PREVIOUS));
//
//        PendingIntent contentPendingIntent = PendingIntent.getActivity(context, 0, new Intent(context, QuizActivity.class), 0);
//
//        builder.setContentTitle(context.getString(R.string.guess))
//                .setContentText(context.getString(R.string.notification_text))
//                .setContentIntent(contentPendingIntent)
//                .setSmallIcon(R.drawable.ic_music_note)
//                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
//                .addAction(playPauseAction)
//                .addAction(restartAction)
//                .setStyle(new androidx.media.app.NotificationCompat.MediaStyle()
//                        .setMediaSession(s.mMediaSession.getSessionToken())
//                        .setShowActionsInCompactView(0, 1));
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN
//                && Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
//            builder.setPriority(NotificationCompat.PRIORITY_HIGH);
//        }
//
//
//        notificationManager.notify(32, builder.build());
//    }
//}
