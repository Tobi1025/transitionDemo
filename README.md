# transitionDemo
##访网易云音乐转场动画
* 5.0以上才有的
* 转场动画是在两个界面的跳转返回时发生的，所以，当使用 intent 跳转界面时，需要调用 ActivityOptionsCompat来指定动画的运行。
    *  // 创建一个包含过渡动画信息的 ActivityOptions 对象
ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, view, getString(R.string.image_transition_name));
    *  // 使用 Intent 跳转界面，并传递共享对象信息
Intent intent = new Intent(this, DetailActivity.class);
startActivity(intent, optionsCompat.toBundle());
* 在第二个界面中找到共享元素，设置transitionName
##至此，过渡动画已经完成，在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流
* 邮件(qiaojingfei2@163.com)
