# 文件注释规范 / FileAnnotationSpecifications

## 类注释 / ClassAnnotations

```
/**
* &#064;Project: ${PRODUCT_NAME}
* &#064;ClassName:     ${NAME}.java <br>
* @author ${USER} <br>
* &#064;Created:  ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE} <br>
* &#064;Description: ${DESCRIPTION} <br>
*
* &#064;Modification History: <br>
* ${DATE} ${USER} ${DESCRIPTION} <br>
* ${DATE} ${USER} ${DESCRIPTION} <br>
*/
```

## 方法注释 / MethodNotes

- 使用EasyJavaDoc / Use EasyJavaDoc
  ```
  /**
  * @param order 
  * @return 
  */
  ```

# javadoc 标签

| Javadoc 标签      | 说明                                       | 示例                                                                |
|-----------------|------------------------------------------|-------------------------------------------------------------------|
| `@author`       | 标识一个类的作者                                 | `@author description`                                             |
| `@deprecated`   | 指明一个过期的类或成员                              | `@deprecated description`                                         |
| `{@docRoot}`    | 指明当前文档根目录的路径                             | `Directory Path`                                                  |
| `@exception`    | 标志一个类抛出的异常                               | `@exception exception-name explanation`                           |
| `{@inheritDoc}` | 从直接父类继承的注释                               | `Inherits a comment from the immediate superclass.`               |
| `{@link}`       | 插入一个到另一个主题的链接                            | `{@link name text}`                                               |
| `{@linkplain}`  | 插入一个到另一个主题的链接，但是该链接显示纯文本字体               | `Inserts an in-line link to another topic.`                       |
| `@param`        | 说明一个方法的参数                                | `@param parameter-name explanation`                               |
| `@return`       | 说明返回值类型                                  | `@return explanation`                                             |
| `@see`          | 指定一个到另一个主题的链接                            | `@see anchor`                                                     |
| `@serial`       | 说明一个序列化属性                                | `@serial description`                                             |
| `@serialData`   | 说明通过writeObject()和 writeExternal()方法写的数据 | `@serialData description`                                         |
| `@serialField`  | 说明一个ObjectStreamField组件                  | `@serialField name type description`                              |
| `@since`        | 标记当引入一个特定的变化时                            | `@since release`                                                  |
| `@throws`       | 和 `@exception`标签一样，表示方法可能抛出的异常           | -                                                                 |
| `{@value}`      | 显示常量的值，该常量必须是static属性                    | `Displays the value of a constant, which must be a static field.` |
| `@version`      | 指定类的版本                                   | `@version info`                                                   |

