# spring bean注入的方式
 * @Service,@Controller,@Repository,@Component Spring带的组件 
 * @Bean导入第三方包里边的组件
 * @Import(要导入容器的组件) 导入的组件的id默认是全类名 例如:com.dhy.demo.entity.Color  
   1) @Import(Color.class) 
   2) @Import(ImportSelector的实现类)  
   3) @Import(ImportBeanDefinitionRegistrar的实现类)  
 * 使用spring的FactoryBean