import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;

/**
* <b>${comment}</b>
*
* @author Ydeane
* @date 2022-01-12
* @version 1.0.0
*/
@Data
@TableName("${tableName}")
public class ${entityName} extends BaseEntity {
private static final long serialVersionUID = 1L;
<#list propertyList as property>
    <#if (property_index == 0)>
		@TableId(type = IdType.NONE)
		private ${property.type} ${property.name};                        // ${property.comment}
        <#else >
	        @TableField(value = "${property.name}")
	        private ${property.type} ${property.name};                        // ${property.comment}
    </#if>
</#list>
}