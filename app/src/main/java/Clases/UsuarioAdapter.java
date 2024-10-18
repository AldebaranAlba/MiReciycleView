package Clases;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mireciycleview.MainActivity;
import com.example.mireciycleview.Perfil;
import com.example.mireciycleview.R;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder> {

    private static List<Usuario> usuarioList;


    public UsuarioAdapter(List<Usuario> UsuarioList){
        usuarioList = UsuarioList;
    }


    @NonNull
    @Override
    public UsuarioAdapter.UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle, parent, false);
        return new UsuarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario usuario = usuarioList.get(position);
        holder.imageButtonUsuario.setImageResource(usuario.getImagen());
        holder.textViewNombre.setText(usuario.getNombre());
        holder.textViewMensaje.setText(usuario.getMensaje_chat());
        holder.textViewUltimaConexion.setText(usuario.getUltima_conexion());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            holder.constraintLayoutFondo.setBackgroundColor(usuario.getColor().toArgb());
        }

        holder.setPosition(position);

    }



    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

            public static class UsuarioViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
                ImageButton imageButtonUsuario;
                TextView  textViewNombre,textViewMensaje,textViewUltimaConexion; // textViewMensajePerfil,textViewEnviarMensaje;
//                ImageView imageViewPicChat;

                private int position;

                public void setPosition(int position){
                    this.position = position;
                }

                ConstraintLayout constraintLayoutFondo;
                public UsuarioViewHolder(@NonNull View itemView){
                    super(itemView);
                    imageButtonUsuario = itemView.findViewById(R.id.imageButtonPersonaje);
                    textViewMensaje = itemView.findViewById(R.id.textViewMensajeChat);
                    textViewNombre = itemView.findViewById(R.id.textViewNombre);
                    textViewUltimaConexion = itemView.findViewById(R.id.textViewUltimaConexion);
                    constraintLayoutFondo = itemView.findViewById(R.id.constraintLayoutFondo);
                    imageButtonUsuario.setOnClickListener(this);

//                    imageViewPicChat = itemView.findViewById(R.id.imageViewPicChat);
//                    textViewMensajePerfil = itemView.findViewById(R.id.textViewMensajePerfil);

                }

                @Override
                public void onClick(View view) {

                    Usuario usuarioSeleccionado = usuarioList.get(position);
                    Context contexto = view.getContext();
                    Intent intent = new Intent(contexto, Perfil.class);
                    intent.putExtra("imagen",usuarioSeleccionado.getImagen());
                    intent.putExtra("mensaje_chat",usuarioSeleccionado.getMensaje_chat());
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        intent.putExtra("color",usuarioSeleccionado.getColor().toArgb());
                    }
                    contexto.startActivity(intent);

                }
            }
}
