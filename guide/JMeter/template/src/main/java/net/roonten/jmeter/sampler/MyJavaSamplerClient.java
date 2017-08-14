package net.roonten.jmeter.sampler;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * 自定义的JavaSamplerClient。
 */
public final class MyJavaSamplerClient implements JavaSamplerClient {

    @Override
    public Arguments getDefaultParameters() {
        Arguments arguments = new Arguments();
        // 这里是设置Java请求参数部分
        arguments.addArgument("param1", "${param1}");
        return arguments;
    }

    @Override
    public SampleResult runTest(JavaSamplerContext ctx) {
        SampleResult result = new SampleResult();
        try {
            result.sampleStart();

            // 这里是业务逻辑调用部分，对响应结果进行包装，按格式返回
            result.setSampleLabel("Java程序的测试结果");
            result.setDataType("text");
            result.setResponseData("这是响应结果，param1=" + ctx.getParameter("param1"), "UTF-8");

            result.setSuccessful(true);
        } catch (Throwable ex) {
            result.setSuccessful(false);
        } finally {
            result.sampleEnd();
        }
        return result;
    }

    @Override
    public void setupTest(JavaSamplerContext arg0) {
        // 这里是业务初始化部分
    }

    @Override
    public void teardownTest(JavaSamplerContext arg0) {
        // 这里是业务销毁部分
    }
}