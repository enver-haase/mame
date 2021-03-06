$input a_position, a_texcoord0, a_color0
$output v_texcoord0, v_color0

// license:BSD-3-Clause
// copyright-holders:Dario Manesku

#include "common.sh"

void main()
{
	gl_Position = mul(u_viewProj, vec4(a_position.xy, 0.0, 1.0));
	v_texcoord0 = a_texcoord0 * vec2(1.0 * 0.8, 0.740740 * 0.8) + vec2(0.1, 0.055555);
	v_color0 = a_color0;
}
