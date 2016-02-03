package com.jike.photoviewdemo;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;
import uk.co.senab.photoview.PhotoViewAttacher.OnPhotoTapListener;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * ��������ͼƬ�ͱ���ͼƬ
 * 
 * PhotoView�������Ŵ���
 * 
 * @author Administrator
 * 
 */

public class MainActivity extends Activity {

	private PhotoView iv_photo;
	private PhotoViewAttacher attacher;//�øö�������װPhotoView
	private ImageLoader loader;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/******************************************************************************************/
		iv_photo = (PhotoView) findViewById(R.id.iv_photo);
		attacher = new PhotoViewAttacher(iv_photo);
		/******************************************************************************************/
		/**
		 * ���ر���ͼƬ�����Ŵ���
		 * */
		// try {
		// InputStream is = getAssets().open("photoview.jpg");
		// Bitmap bm = BitmapFactory.decodeStream(is);
		// iv_photo.setImageBitmap(bm);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		/******************************************************************************************/
		/**
		 * ��������ͼƬ
		 */
		loader = ImageLoader.getInstance();//����ImageLoader����
		loader.displayImage("https://www.baidu.com/img/bdlogo.png", iv_photo);
		/**
		 * ��PhotoView��ӵ����¼�
		 */
		iv_photo.setOnPhotoTapListener(new OnPhotoTapListener() {
			/**
			 *
			 * @param arg0
			 * @param arg1
             * @param arg2
             */
			@Override
			public void onPhotoTap(View arg0, float arg1, float arg2) {
				Log.d("MainActivity", "arg0��"+arg0+", "+"arg1��"+arg1+" "+"arg2��"+arg2);
			}
		});
		/******************************************************************************************/
	}

}
