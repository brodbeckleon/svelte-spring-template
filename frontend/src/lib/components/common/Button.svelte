<script lang="ts">
	import type { SvelteComponent } from 'svelte';

	interface ButtonProps {
		label: string;
		title?: string;
		icon?: SvelteComponent; // Changed type to accept a Svelte component
		onClick?: () => void;
		href?: string;
		disabled?: boolean;
	}
	const { label, title, icon, onClick, disabled }: ButtonProps = $props();
</script>

<button
	type="button"
	class="inline-flex items-center rounded-md bg-gray-50 px-2 py-1 text-xs font-medium text-gray-600 ring-1 ring-gray-500/10 ring-inset"
	{title}
	onclick={onClick}
	{disabled}
>
	{label}
	{#if icon}
		<span class="ml-1">
			<icon> </icon>
		</span>
	{/if}
</button>
