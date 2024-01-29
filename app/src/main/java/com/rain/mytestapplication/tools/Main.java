//假设我们有如下代码，query 是公共方法会提供给任意业务方调用，请完成 query 方法，每次有数据回调，并要求 loadFromServer 调用次数最多只执行一次。
//        loadFromServer 返回结果是可以复用。
//
//public class Main {
//
//    private Executor mExecutor = Executors.newFixedThreadPool(4);
//    private Executor mServerExecutor = Executors.newFixedThreadPool(1);
//
//    private Data mData;
//
//    private Object object;
//    private Boolean booleen = true;
//
//    public void queryData(Callback callback) {
//        if (callback == null) {
//            return;
//        }
//
//        if (mData != null) {
//            callback.onSuccess(mData);
//            return;
//        }
//
//        synchronized (object) {
//            //toast提示等待
//
//            if (booleen) {
//
//                mExecutor.execute(new Runnable() {
//                    @Override
//                    public void run() {
//                        // todo
//                        loadFromServer(callback = new Callback() {
//                            fun onSuccess (Data data){
//                                mData = data;
//                                callback.onSuccess(data);
//                                object.notifyAll();
//                            }
//                        });
//                    }
//                });
//
//                booleen = false;
//            } else {
//
//                object.wait();
//                if (mData != null) {
//                    callback.onSuccess(mData);
//                }
//
//            }
//
//        }
//
//
//    }
//
//
//    private void loadFromServer(Callback callback) {
//        mServerExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//                // mock
//                try {
//                    Thread.sleep(5000L);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                if (callback != null) {
//                    callback.onSuccess(new Data("fromserver"));
//                }
//            }
//        });
//    }
//
//    public static class Data {
//        String from;
//
//        Data(String from) {
//            this.from = from;
//        }
//    }
//
//    public interface Callback {
//        void onSuccess(Data data);
//    }
//
//}