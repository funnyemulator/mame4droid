�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�?zw/$֦�v�u���[�Y�wt�n�ʝܗ|ɖ��ct�Wa�fe�<�v���@�U�q{#�TE�v�$�/	��ט�b�Y
l��)�ٍ���A����:���T��O	o�����54#-�� p<�$ʊ�����8��V���di-����ę��V�h:p8x����Ǔ!eG�����=&PZ�㪃��c%��U��u�rXN����ҶY��k�k���d6��§}�_�U�=h��XB ��p�QR�t%������qQ�"���b"�yK�k��[yM���]�m�]����Og�^E�iŴ�o���)+\ʮ�5T~�/t��_���	��N��7�(�J��k��K0
��U��{�X��Y���waH/��t�]>Q/�X�-쌖�p�çQ�ȑ�%���.SB��ª=T�oY�<O�S�?U2f�����
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p2letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float � = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textue2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
