1111111111111111111111
重写onKeyDown方法就行：
@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			//写下你希望按下返回键达到的效果代码，不写则不会有反应
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	用线程实现继续在后台运行，
	重新进入还存在的话可以让线程画完后把数据存在文件里，
	下次进去先读取文件