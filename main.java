1111111111111111111111
��дonKeyDown�������У�
@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			//д����ϣ�����·��ؼ��ﵽ��Ч�����룬��д�򲻻��з�Ӧ
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	���߳�ʵ�ּ����ں�̨���У�
	���½��뻹���ڵĻ��������̻߳��������ݴ����ļ��
	�´ν�ȥ�ȶ�ȡ�ļ�