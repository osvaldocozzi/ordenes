import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.ordenes.Dto.UsuarioDTO;
import com.example.ordenes.Model.Usuario;

@Mapper
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toDto(Usuario usuario);

    Usuario toEntity(UsuarioDTO usuarioDTO);
}